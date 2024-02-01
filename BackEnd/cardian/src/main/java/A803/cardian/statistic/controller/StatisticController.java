package A803.cardian.statistic.controller;

//import A803.cardian.statistic.service.StatisticService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "통계 컨트롤러", description = "통계 관련 정보")
@RequestMapping("/statistic")
@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
public class StatisticController {

    
}
