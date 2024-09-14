package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.mbadevelopers.chatapp.DataBinderMapperImpl());
  }
}
