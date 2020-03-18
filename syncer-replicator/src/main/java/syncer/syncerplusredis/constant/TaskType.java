package syncer.syncerplusredis.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zhanenqiang
 * @Description 描述
 * @Date 2020/3/17
 */
@AllArgsConstructor
public enum TaskType {

    /**
     *任务类型
     * default total   1  全量＋增量
     *  stockonly      2  全量
     *  incrementonly  3  增量
     */
    TOTAL(1,TaskRunTypeEnum.TOTAL,"全量+增量"),
    STOCKONLY(2,TaskRunTypeEnum.STOCKONLY,"只全量"),
    INCREMENTONLY(3,TaskRunTypeEnum.STOCKONLY,"只增量");

    @Getter
    private int code;
    @Getter
    private TaskRunTypeEnum type;
    @Getter
    private String msg;
}
