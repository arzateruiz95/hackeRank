public class Encryption {

    public static final String EMPTY = "";
    public static final String SPACE = " ";

    public static String solution(String s) {
        int length = s.length();
        int[] matrix = getMatrix(length);
        int columns = matrix[1];
        StringBuilder stringBuilder = new StringBuilder();
        int index;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < matrix[0]; i++) {
                index = (i * columns) + j;
                stringBuilder.append(index < length ? s.charAt(index) : EMPTY);
            }
            stringBuilder.append(SPACE);
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public static int[] getMatrix(int length) {
        int row = (int) Math.floor(Math.sqrt((double) length));
        int columns = row * row == length ? row : row + 1;
        row = row * columns < length ? row + 1 : row;
        return new int[]{row, columns};
    }

}

