 public static boolean isNullOrBlank(String text) {
        return (text == null || text.trim().equalsIgnoreCase("") || text.trim().equalsIgnoreCase("null")) ? true
                : false;
    }

    public static boolean isNullOrBlank(Spanned text) {
        return (text == null || text.toString().trim().equalsIgnoreCase("") || text.toString().trim().equalsIgnoreCase("null")) ? true
                : false;
    }

    public static boolean isNullOrZeroNumber(long l) {
        String text = String.valueOf(l);
        return (text == null || text.trim().equalsIgnoreCase("") || text.trim().equalsIgnoreCase("null")
                || Long.valueOf(text.trim()) == 0) ? true : false;
    }

    public static boolean isNullOrEmptyList(List<?> list) {
        return (list == null || list.size() <= 0) ? true : false;
    }

    public static boolean isNullOrEmptyList(Set<?> list) {
        return (list == null || list.size() <= 0) ? true : false;
    }

    public static boolean isNullOrEmptyList(HashMap<?, ?> hashMap) {
        return (hashMap == null || hashMap.size() <= 0) ? true : false;
    }

    public static Integer getValidatedIntegerValue(EditText textView) {
        String validatedValue = getValidatedValueOrNull(textView);
        try {
            if (!isNullOrBlank(validatedValue)) {
                Integer value = Integer.parseInt(validatedValue);
                return value;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static Double getValidatedDoubleValue(EditText textView) {
        String validatedValue = getValidatedValueOrNull(textView);
        try {
            if (!isNullOrBlank(validatedValue)) {
                Double value = Double.parseDouble(validatedValue);
                return value;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }

    public static String getValidatedValueOrNull(EditText editText) {
        String value = String.valueOf(editText.getText());
        if (!isNullOrBlank(value))
            return value.trim();
        return null;
    }

    public static String getValidatedValueOrNull(TextView textView) {
        String value = String.valueOf(textView.getText());
        if (!isNullOrBlank(value))
            return value.trim();
        return null;
    }
