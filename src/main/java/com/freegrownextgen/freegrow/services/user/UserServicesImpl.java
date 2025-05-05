package com.freegrownextgen.freegrow.services.user;

import com.freegrownextgen.freegrow.enums.response.ResponseEnums;
import com.freegrownextgen.freegrow.models.requestdtos.user.ConfigRoleRequestDto;

public interface UserServicesImpl {

    public ResponseEnums configRole(ConfigRoleRequestDto request);
    
}
