package crud.crud_board.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString // 클래스의 모든 필드를 포함한 toString() 메서드를 생성
@NoArgsConstructor // 기본 생성자(파라미터가 없는 생성자)를 자동으로 생성
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits; // 조회수
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;
}
