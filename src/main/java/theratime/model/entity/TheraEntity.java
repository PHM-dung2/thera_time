package theratime.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table( name = "theratime" ) @Builder
@Data @NoArgsConstructor @AllArgsConstructor
public class TheraEntity extends BaseTime {



}
