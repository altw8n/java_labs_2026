package org.example.chapter01.task25;

import java.math.BigInteger;

public class MyBigDecimal {
    private final BigInteger intVal;
    private final int scale;

    public MyBigDecimal(BigInteger intVal, int scale) {
        this.intVal = intVal;
        this.scale = scale;
    }

    public String toString() {
        String str = intVal.toString();
        if (scale == 0) {
            return str;
        }
        int point = str.length() - scale;
        if (point <= 0) {
            return "0." + "0".repeat(-point) + str;
        }
        return str.substring(0, point) + "." + str.substring(point);
    }

    public MyBigDecimal add(MyBigDecimal other) {
        int maxScale = Math.max(this.scale, other.scale);
        BigInteger unscaledThis = this.intVal.multiply(BigInteger.TEN.pow(maxScale - this.scale));
        BigInteger unscaledOther = other.intVal.multiply(BigInteger.TEN.pow(maxScale - other.scale));
        BigInteger res = unscaledThis.add(unscaledOther);
        return new MyBigDecimal(res, maxScale);
    }

    public MyBigDecimal subtract(MyBigDecimal other) {
        int maxScale = Math.max(this.scale, other.scale);
        BigInteger unscaledThis = this.intVal.multiply(BigInteger.TEN.pow(maxScale - this.scale));
        BigInteger unscaledOther = other.intVal.multiply(BigInteger.TEN.pow(maxScale - other.scale));
        BigInteger res = unscaledThis.subtract(unscaledOther);
        return new MyBigDecimal(res, maxScale);
    }

    public MyBigDecimal multiply(MyBigDecimal other) {
        BigInteger unscaledRes = this.intVal.multiply(other.intVal);
        int resScale = this.scale + other.scale;
        return new MyBigDecimal(unscaledRes, resScale);
    }

    public MyBigDecimal divide(MyBigDecimal other, int resScale) {
        BigInteger divided = this.intVal.multiply(BigInteger.TEN.pow(resScale));
        BigInteger result = divided.divide(other.intVal);
        int finalScale = resScale + this.scale - other.scale;
        return new MyBigDecimal(result, finalScale);
    }
}
