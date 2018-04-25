package com.estreet.dashboard;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ForcastDashboardController {

	@GetMapping("/getPastPowerUsage")
	@CrossOrigin
	@ResponseBody
	public PastPowerUsage getPastPowerUsage() {
		List<String> monthsList = Arrays.asList("Jan", "Feb", "Mar", "Apr",
				"May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
		List<Double> dataList = Arrays.asList(7.0D, 6.9D, 9.5D, 14.5D, 18.2D,
				21.5D, 25.2D, 26.5D, 23.3D, 18.3D, 13.9D, 9.6D);
		return new PastPowerUsage(monthsList, dataList);
	}
}
