create table t_admin
(
    id       int auto_increment comment 'ID'
        primary key,
    username varchar(200) not null comment '用户名',
    password varchar(200) not null comment '密码'
)
    comment '管理员表';

create table t_type
(
    id   int auto_increment comment 'ID'
        primary key,
    name varchar(50) not null comment '类型名称'
)
    comment '菜品类型';

create table t_menu
(
    id     int auto_increment comment 'ID'
        primary key,
    name   varchar(200)  not null comment '菜单名',
    price  decimal(6, 2) not null comment '价格',
    flavor varchar(50)   not null comment '口味',
    tid    int           null comment '类型ID',
    constraint t_menu_t_type_id_fk
        foreign key (tid) references t_type (id)
)
    comment '菜单表';

create table t_user
(
    id         int auto_increment comment 'ID'
        primary key,
    username   varchar(200) not null comment '用户名',
    password   varchar(200) not null comment '密码',
    nickname   varchar(50)  not null comment '昵称',
    gender     char(2)      not null comment '性别',
    telephone  varchar(11)  not null comment '电话',
    address    varchar(255) not null comment '地址',
    createtime datetime     not null comment '注册时间'
)
    comment '用户表';

create table t_order
(
    id    int auto_increment comment 'ID'
        primary key,
    uid   int      not null comment '用户ID',
    mid   int      not null comment '菜单ID',
    aid   int      not null comment '管理员ID',
    date  datetime not null comment '日期',
    state char     not null comment '状态',
    constraint t_order_t_admin_id_fk
        foreign key (aid) references t_admin (id),
    constraint t_order_t_menu_id_fk
        foreign key (mid) references t_menu (id),
    constraint t_order_t_user_id_fk
        foreign key (uid) references t_user (id)
)
    comment '订单';


