package theratime.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import theratime.service.TheraService;

@RestController
@RequestMapping("/thera")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TheraController {
    private final TheraService theraService;


    // 1. 시간표 등록

    // 2. 시간표 전체 조회

    // 3. 시간표 개별 조회

    // 4. 시간표 수정

    // 5. 시간표 삭제

}
