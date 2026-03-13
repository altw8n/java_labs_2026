/*Реализуйте запись TimeOfDay с компонентами hour и minute. Н
ормализуйте их так, чтобы час был между 0 и 23, а минуты между 0 и 59.
Предоставьте метод TimeOfDay plusMinutes(int minutes),
который создает новый объект TimeOfDay, отстоящий на заданное количество минут,
и метод int minutesFrom(TimeOfDay other),
который возвращает количество минут между текущим и заданным экземпляром TimeOfDay.*/

package org.example.chapter02.task09;

public record TimeOfDay(int hour, int minute) {
    public TimeOfDay {
        if (minute < 0 || minute >= 60){
            int extraHours = minute / 60;
            minute = minute % 60;
            if (minute < 0){
                minute += 60;
                extraHours--;
            }
            hour += extraHours;
        }
        hour = Math.floorMod(hour, 24);
    }

    public TimeOfDay plusMinutes(int minutes){
        int totalMinutes = this.hour * 60 + this.minute;
        totalMinutes += minutes;
        totalMinutes = Math.floorMod(totalMinutes, 24 * 60);
        int newHour = totalMinutes / 60;
        int newMinute = totalMinutes % 60;
        return new TimeOfDay(newHour, newMinute);
    }

    public int minutesFrom(TimeOfDay other){
        int thisTotal = this.hour * 60 + this.minute;
        int otherTotal = other.hour * 60 + other.minute;
        return thisTotal - otherTotal;
    }
}
