package MZ.TrackX.controller;

import MZ.TrackX.dto.GraphDto;
import MZ.TrackX.service.stats.StatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller for statistics related operations.
 * Exposes API endpoints for retrieving chart data.
 */
@RestController
@RequestMapping("/api/stats")
@RequiredArgsConstructor // Lombok annotation to generate a constructor with required arguments (final fields)
@CrossOrigin("*") // Allows requests from any origin. Consider restricting this in production.
public class StatsController {

    private final StatsService statsService; // Injects the StatsService dependency

    /**
     * Retrieves chart details containing income and expense data for a specific period.
     *
     * @return ResponseEntity containing a GraphDto with income and expense lists.
     */
    @GetMapping("/chart")
    public ResponseEntity<GraphDto> getChartDetails(){
        // Calls the service layer to get the chart data
        GraphDto chartData = statsService.getChartData();
        // Returns an OK (200) response with the chart data
        return ResponseEntity.ok(chartData);
    }

    @GetMapping
    public ResponseEntity<?> getStats(){
        return ResponseEntity.ok(statsService.getState());
    }
}