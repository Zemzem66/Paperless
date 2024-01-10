package com.paperless.services.mapper;

import com.paperless.persistence.entities.*;
import com.paperless.persistence.repositories.*;
import com.paperless.services.dto.Permissions;
import com.paperless.services.dto.PermissionsView;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class PermissionsMapper implements BaseMapper<AuthUser, Permissions> {

    @Autowired
    private CorrespondentRepository correspondentRepository;
    @Autowired
    private DocumentTypeRepository documentTypeRepository;
    @Autowired
    private StoragePathRepository storagePathRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private DocumentTagsRepository documentTagsRepository;
    @Autowired
    private PermissionRepository  permissionRepository;

    @Mapping(target = "view", source = "id", qualifiedByName = "viewEntity")
    @Mapping(target = "change", source = "id", qualifiedByName = "changeEntity")
    abstract public Permissions entityToDto(AuthUser entity);

    @Named("viewEntity")
    PermissionsView map1(Integer id) {
        if(id==null)
            return new PermissionsView();
        return new PermissionsView().addUsersItem(id);
    }

    @Named("changeEntity")
    PermissionsView map2(Integer id) {
        if(id==null)
            return new PermissionsView();
        return new PermissionsView().addUsersItem(id);
    }

}
