package com.duitddu.template.mvvm.di

import com.duitddu.template.mvvm.data.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMyRepository(): MyRepository =
        MyRepository()
}