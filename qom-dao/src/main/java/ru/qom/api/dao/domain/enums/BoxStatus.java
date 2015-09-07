package ru.qom.api.dao.domain.enums;

/**
 * Created by Тимакс on 05.09.2015.
 */
public enum BoxStatus {
    NOT_ACCESSIBLE(0), VISIBLE(1), READY_TO_OPEN(2), OPENED(3);

    private final int idStatus;

    BoxStatus(int idStatus) {

        this.idStatus = idStatus;
    }

    public int getIdStatus() {
        return idStatus;
    }
}
