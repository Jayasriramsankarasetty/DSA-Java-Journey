class Leetcode2965Easy {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] flatArray = new int[n * n];
        boolean[] seen = new boolean[n * n + 1];
        int repeated = -1;

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flatArray[index++] = grid[i][j];
            }
        }

        for (int num : flatArray) {
            if (seen[num]) {
                repeated = num;
            } else {
                seen[num] = true;
            }
        }

        int missing = -1;
        for (int i = 1; i <= n * n; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        return new int[]{repeated, missing};
    }
}
