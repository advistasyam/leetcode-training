class Solution {
    public int findSoldier(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                total++;
            }
        }
        return total;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> arrInt = new ArrayList<>();
        List<Integer> arrIndex = new ArrayList<>();
        // int dataReturned = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            int totalSoldier = findSoldier(mat[i]);

            boolean needInsert = true;

            for (int j = 0; j < arrInt.size(); j++) {
                if (arrInt.get(j) > totalSoldier) {
                    arrInt.add(j, totalSoldier);
                    arrIndex.add(j, i);
                    needInsert = false;
                    break;
                }
            }

            if (needInsert) {
                arrInt.add(totalSoldier);
                arrIndex.add(i);
            }
        }

        arrIndex = arrIndex.subList(0,k);

        int[] data = arrIndex.stream().mapToInt(i -> i).toArray();

        return data;
    }
}