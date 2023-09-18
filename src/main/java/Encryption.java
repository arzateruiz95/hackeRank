public class Encryption {

    public static final String EMPTY = "";
    public static final String SPACE = " ";

    public static String encryption(String s) {
        int length = s.length();
        int row = (int) Math.floor(Math.sqrt( length));
        if (row * row != length){
            row ++;
        }
        int columns =  row;
        StringBuilder stringBuilder = new StringBuilder();
        int index;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < row; i++) {
                index = (i * columns) + j;
                stringBuilder.append(index < length ? s.charAt(index) : EMPTY);
            }
            stringBuilder.append(SPACE);
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }

}

