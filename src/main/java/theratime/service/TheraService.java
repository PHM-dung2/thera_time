package theratime.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import theratime.model.repository.TheraRepository;
import theratime.util.ApiResponse;

@Service
@Transactional
@RequiredArgsConstructor
public class TheraService {
    private final TheraRepository theraRepository;

    // 1. 시간표 등록
    @PostMapping("/write")
    public ApiResponse<Boolean> onWrite(String token ){

        return new ApiResponse<>( true, "시간표 등록 성공", null );
    }

    // 2. 시간표 전체 조회

    // 3. 시간표 개별 조회

    // 4. 시간표 수정

    // 5. 시간표 삭제

}
