package SortingAndSearch;

/*Answer:
 * The optimal approach would be external sort.
 * (1)Split:
 * Split the entire file into multiple chunks(Using hashcode or mod operation);
 * Sort the each small chunk and write them in the external memory.
 * (2) Merge sort:
 * Merge sort the chunks one by one. */