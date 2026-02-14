package com.luv2code.designpatterns.behavioral.memento;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Role: Originator
 *
 * Maintains the internal state of the course catalog query.
 * Responsible for creating and restoring snapshots.
 *
 * Encapsulation is preserved because only the Originator
 * can access the contents of the Memento.
 */
public class CatalogQueryState {

    private String searchText = "";
    private Map<String, Set<String>> filters = new LinkedHashMap<>();
    private String sortField = "name";
    private SortDirection sortDirection = SortDirection.ASCENDING;

    public void setSearchText(String theSearchText) {
        searchText = (theSearchText == null) ? "" : theSearchText;
    }

    public void addFilter(String key, String value) {

        Set<String> values = filters.get(key);

        if (values == null) {
            values = new LinkedHashSet<>();
            filters.put(key, values);
        }

        values.add(value);
    }

    public void removeFilter(String key, String value) {

        Set<String> values = filters.get(key);

        if (values != null) {
            values.remove(value);
            if (values.isEmpty()) {
                filters.remove(key);
            }
        }
    }

    public void clearFilters() {
        filters.clear();
    }

    public void setSort(String theSortField, SortDirection theSortDirection) {
        sortField = theSortField;
        sortDirection = theSortDirection;
    }

    @Override
    public String toString() {
        return "CatalogQueryState{" +
                "searchText='" + searchText + '\'' +
                ", filters=" + filters +
                ", sortField='" + sortField + '\'' +
                ", sortDirection=" + sortDirection +
                '}';
    }

    // Add some snapshot operations

    private Map<String, Set<String>> deepCopy(Map<String, Set<String>> original) {

        Map<String, Set<String>> copy = new LinkedHashMap<>();

        for (Map.Entry<String, Set<String>> entry : original.entrySet()) {

            Set<String> valuesCopy = new LinkedHashSet<>(entry.getValue());

            copy.put(entry.getKey(), valuesCopy);
        }

        return copy;
    }

    public QuerySnapshot createSnapshot() {

        return new QuerySnapshot(
                searchText,
                deepCopy(this.filters),
                sortField,
                sortDirection
        );
    }

    public void restore(QuerySnapshot snapshot) {
        searchText = snapshot.searchText;
        filters = deepCopy(snapshot.filters);
        sortField = snapshot.sortField;
        sortDirection = snapshot.sortDirection;
    }


    /**
     * Role: Memento
     *
     * Encapsulated snapshot of CatalogQueryState.
     * The state is accessible only to the Originator.
     */
    static class QuerySnapshot {

        private final String searchText;
        private final Map<String, Set<String>> filters;
        private final String sortField;
        private final SortDirection sortDirection;

        private QuerySnapshot(
                String searchText,
                Map<String, Set<String>> filters,
                String sortField,
                SortDirection sortDirection) {

            this.searchText = searchText;
            this.filters = filters;
            this.sortField = sortField;
            this.sortDirection = sortDirection;
        }
    }


}













