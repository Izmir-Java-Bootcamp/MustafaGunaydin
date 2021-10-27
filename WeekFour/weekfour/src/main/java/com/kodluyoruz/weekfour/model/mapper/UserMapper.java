package com.kodluyoruz.weekfour.model.mapper;
import com.kodluyoruz.weekfour.model.dto.UserDto;
import com.kodluyoruz.weekfour.model.entity.User;
import com.kodluyoruz.weekfour.model.request.CreateUpdateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    UserDto toUserDto(User user);

    List<UserDto> toUserDtoList(List<User> users);

    User createUser(CreateUpdateUserRequest request);
}
