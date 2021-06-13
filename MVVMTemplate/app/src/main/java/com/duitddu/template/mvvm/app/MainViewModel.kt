package com.duitddu.template.mvvm.app

import androidx.lifecycle.ViewModel
import com.duitddu.template.mvvm.data.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val myRepository: MyRepository
) : ViewModel() {

}