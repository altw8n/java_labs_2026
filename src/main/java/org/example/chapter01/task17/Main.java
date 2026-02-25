package org.example.chapter01.task17;
// src/java.base/java/util/ComparableTimSort.java
// labeled break

/*public class Main {
    outer:
            while (true) {
        int count1 = 0; // Number of times in a row that first run won
        int count2 = 0; // Number of times in a row that second run won

        do {
            assert len1 > 1 && len2 > 0;
            if (((Comparable) a[cursor2]).compareTo(tmp[cursor1]) < 0) {
                a[dest++] = a[cursor2++];
                count2++;
                count1 = 0;
                if (--len2 == 0)
                    break outer;
            } else {
                a[dest++] = tmp[cursor1++];
                count1++;
                count2 = 0;
                if (--len1 == 1)
                    break outer;
            }
        } while ((count1 | count2) < minGallop);

        do {
            assert len1 > 1 && len2 > 0;
            count1 = gallopRight((Comparable) a[cursor2], tmp, cursor1, len1, 0);
            if (count1 != 0) {
                System.arraycopy(tmp, cursor1, a, dest, count1);
                dest += count1;
                cursor1 += count1;
                len1 -= count1;
                if (len1 <= 1)  // len1 == 1 || len1 == 0
                    break outer;
            }
            a[dest++] = a[cursor2++];
            if (--len2 == 0)
                break outer;

            count2 = gallopLeft((Comparable) tmp[cursor1], a, cursor2, len2, 0);
            if (count2 != 0) {
                System.arraycopy(a, cursor2, a, dest, count2);
                dest += count2;
                cursor2 += count2;
                len2 -= count2;
                if (len2 == 0)
                    break outer;
            }
            a[dest++] = tmp[cursor1++];
            if (--len1 == 1)
                break outer;
            minGallop--;
        } while (count1 >= MIN_GALLOP | count2 >= MIN_GALLOP);
        if (minGallop < 0)
            minGallop = 0;
        minGallop += 2;
    }  // End of "outer" loop
}*/



// rewrited

/*public class Main {
    boolean outer = false;
    while (!outer) {
        int count1 = 0; // Number of times in a row that first run won
        int count2 = 0; // Number of times in a row that second run won

        do {
            assert len1 > 1 && len2 > 0;
            if (((Comparable) a[cursor2]).compareTo(tmp[cursor1]) < 0) {
                a[dest++] = a[cursor2++];
                count2++;
                count1 = 0;
                if (--len2 == 0)
                    outer = true;
                    break;
            } else {
                a[dest++] = tmp[cursor1++];
                count1++;
                count2 = 0;
                if (--len1 == 1)
                    outer = true;
                    break;
            }
        } while ((count1 | count2) < minGallop);

        do {
            assert len1 > 1 && len2 > 0;
            count1 = gallopRight((Comparable) a[cursor2], tmp, cursor1, len1, 0);
            if (count1 != 0) {
                System.arraycopy(tmp, cursor1, a, dest, count1);
                dest += count1;
                cursor1 += count1;
                len1 -= count1;
                if (len1 <= 1)  // len1 == 1 || len1 == 0
                    outer = true;
                    break;
            }
            a[dest++] = a[cursor2++];
            if (--len2 == 0){
                outer = true;
                break;
            }

            count2 = gallopLeft((Comparable) tmp[cursor1], a, cursor2, len2, 0);
            if (count2 != 0) {
                System.arraycopy(a, cursor2, a, dest, count2);
                dest += count2;
                cursor2 += count2;
                len2 -= count2;
                if (len2 == 0)
                    break outer;
            }
            a[dest++] = tmp[cursor1++];
            if (--len1 == 1){
                outer = true;
                break;
            }
            minGallop--;
        } while (count1 >= MIN_GALLOP | count2 >= MIN_GALLOP);
        if (minGallop < 0)
            minGallop = 0;
        minGallop += 2;
    }
}*/