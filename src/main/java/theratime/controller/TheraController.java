package theratime.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import theratime.model.dto.TheraDto;
import theratime.service.TheraService;
import theratime.util.ApiResponse;

@RestController
@RequestMapping("/thera")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TheraController {
    private final TheraService theraService;


    // 1. 시간표 등록
    @PostMapping("/write")
    public ResponseEntity< ApiResponse<Boolean> > onWrite(@RequestHeader("Authorization") String token, @RequestBody TheraDto theraDto ){

        ApiResponse<Boolean> result = theraService.onWrite( token );
        return ResponseEntity.status( 201 ).body( result );
    }

    // 2. 시간표 전체 조회
    @GetMapping("/get")
    public ResponseEntity< ApiResponse<TheraDto> > findAll(@RequestHeader("Authorization") String token ){

        ApiResponse<TheraDto> result = theraService.findAll(token);
        return ResponseEntity.status( 201 ).body( result );
    }

    // 3. 시간표 개별 조회

    // 4. 시간표 수정

    // 5. 시간표 삭제

}
