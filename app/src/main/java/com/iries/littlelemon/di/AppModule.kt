package com.iries.littlelemon.di

import android.content.Context
import com.iries.littlelemon.LemonApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideBaseApplication(@ApplicationContext context: Context): LemonApplication {
        return context as LemonApplication
    }
}