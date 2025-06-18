package MZ.TrackX.service.stats;

import MZ.TrackX.dto.GraphDto;
import MZ.TrackX.dto.StatsDto;

public interface StatsService {
    GraphDto getChartData();
    StatsDto getState();
}
