package de.florianmichael.bukkitextensions.modern_commands_v1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringArrayWrapper {

    private String[] args;

    public StringArrayWrapper(String[] args) {
        setArgs(args);
    }

    public String get(int i) {
        if (i >= getArgs().length) return "";
        return getArgs()[i];
    }

    public String[] fromTillEnd(int from) {
        return Arrays.copyOfRange(getArgs(), from, getArgs().length);
    }

    public String[] from(int from, int till) {
        return Arrays.copyOfRange(getArgs(), from, till);
    }

    public List<String> getAsList() {
        return Arrays.asList(getArgs());
    }

    public String get(int from, int till) {
        return get(" ", from, till);
    }

    public String get(String point, int from, int till) {
        final StringBuilder returnS = new StringBuilder();

        for (int i = from; i < till; i++)
            returnS.append(point).append(getArgs()[i]);

        return returnS.toString().trim();
    }

    public String get() {
        return get(" ");
    }

    public String get(String point) {
        return String.join(point, getArgs());
    }

    public boolean isInt(int i) {
        if (i >= getArgs().length) return false;
        return isInt(getArgs()[i]);
    }

    public boolean isDouble(int i) {
        if (i >= getArgs().length) return false;
        return isDouble(getArgs()[i]);
    }

    public boolean isFloat(int i) {
        if (i >= getArgs().length) return false;
        return isFloat(getArgs()[i]);
    }

    public boolean isLong(int i) {
        if (i >= getArgs().length) return false;
        return isLong(getArgs()[i]);
    }

    public boolean isShort(int i) {
        if (i >= getArgs().length) return false;
        return isShort(getArgs()[i]);
    }

    public boolean isByte(int i) {
        if (i >= getArgs().length) return false;
        return isByte(getArgs()[i]);
    }

    public int getInt(int i) {
        if (i >= getArgs().length) return 0;
        return getInt(getArgs()[i]);
    }

    public double getDouble(int i) {
        if (i >= getArgs().length) return 0.0D;
        return getDouble(getArgs()[i]);
    }

    public float getFloat(int i) {
        if (i >= getArgs().length) return 0.0F;
        return getFloat(getArgs()[i]);
    }

    public long getLong(int i) {
        if (i >= getArgs().length) return 0L;
        return getLong(getArgs()[i]);
    }

    public short getShort(int i) {
        if (i >= getArgs().length) return (short) 0;
        return getShort(getArgs()[i]);
    }

    public byte getByte(int i) {
        if (i >= getArgs().length) return (byte) 0;
        return getByte(getArgs()[i]);
    }

    public boolean getBoolean(int i) {
        if (i >= getArgs().length) return false;
        return getBoolean(getArgs()[i]);
    }

    public boolean isInt(String i) {
        try {
            Integer.parseInt(i);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    public boolean isDouble(String i) {
        try {
            Double.parseDouble(i);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    public boolean isFloat(String i) {
        try {
            Float.parseFloat(i);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    public boolean isLong(String i) {
        try {
            Long.parseLong(i);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    public boolean isShort(String i) {
        try {
            Short.parseShort(i);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    public boolean isByte(String i) {
        try {
            Byte.parseByte(i);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    public int getInt(String i) {
        try {
            return Integer.parseInt(i);
        } catch (Exception ignored) {
            return 0;
        }
    }

    public double getDouble(String i) {
        try {
            return Double.parseDouble(i);
        } catch (Exception ignored) {
            return 0.0D;
        }
    }

    public float getFloat(String i) {
        try {
            return Float.parseFloat(i);
        } catch (Exception ignored) {
            return 0.0F;
        }
    }

    public long getLong(String i) {
        try {
            return Long.parseLong(i);
        } catch (Exception ignored) {
            return 0L;
        }
    }

    public short getShort(String i) {
        try {
            return Short.parseShort(i);
        } catch (Exception ignored) {
            return (short) 0;
        }
    }

    public byte getByte(String i) {
        try {
            return Byte.parseByte(i);
        } catch (Exception ignored) {
            return (byte) 0;
        }
    }

    public boolean getBoolean(String i) {
        try {
            return Boolean.parseBoolean(i);
        } catch (Exception ignored) {
            return false;
        }
    }

    public boolean existArg(int i) {
        return i >= getArgs().length;
    }

    public int size() {
        return getArgs().length;
    }

    public Stream<String> stream() {
        return Arrays.stream(getArgs());
    }

    private String[] getArgs() {
        return args;
    }

    private void setArgs(String[] args) {
        this.args = args;
    }
}
