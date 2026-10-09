class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        long uniqueCounts = freqMap.values().stream().distinct().count();
        return freqMap.size() == uniqueCounts;
    }
}