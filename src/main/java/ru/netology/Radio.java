package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    public int maxWave = 9;
    public int minWave = 0;
    public int maxVolume = 100;
    public int minVolume = 0;
    public int currentRadioWave = minWave;
    public int currentVolume = minVolume;
}



