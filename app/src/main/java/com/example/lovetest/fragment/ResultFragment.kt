package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import kotlinx.android.synthetic.main.fragment_result.*


class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?: -1

        return inflater.inflate(R.layout.fragment_result, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        setResult(option)

        btn_home.setOnClickListener{
            navController.navigate(R.id.action_mainFragment_to_questionFragment)
        }
    }

    private fun setResult(option: Int) {

        when(option) {
            1 -> {
                resultText1.text = "당신은 사랑을 빠르게 끝내는 사람 입니다"
                resultText2.text = "당신은 연인과 갈등이 심하면 관계를 바로 정리하는 타입 입니다"
            }

            2 -> {

                resultText1.text = "당신은 당신 자신에 집중하는 사람 입니다"
                resultText2.text = "당신은 당신의 전 여자친구를 정말 귀찮게 생각하는 타입 입니다"
            }

            3 -> {

                resultText1.text = "당신은 결과를 쉽게 받아드리지 못하는 타입 입니다"
                resultText2.text = "당신은 헤어짐을 받아드리는데 힘든 타입 입니다."

            }

            4 -> {

                resultText1.text = "당신은 헤어짐의 마스터 입니다"
                resultText2.text = "당신은 밥먹듯이 헤어짐을 결심 하는 타입 입니다."

            }
        }
    }


}