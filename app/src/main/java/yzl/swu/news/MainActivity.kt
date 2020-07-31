package yzl.swu.news

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginTop

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //代码创建界面 -》 承载内容  LinearLayout RelativeLayout ConsstraintLayout
        //MainActivity -> ... ->Context
        //addLinearLayout()
        //addRelativeLayout()
        addConstraintLayout()

    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun addLinearLayout(){
        val container = LinearLayout(this).apply {
            //设置容器宽高
            layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT)
            //设置布局方向
            orientation = LinearLayout.VERTICAL
            background = getDrawable(R.color.colorPrimary)
        }.also {
            //加到Activity
            setContentView(it)
        }

        //创建子控件
        LinearLayout(this).apply {
            //设置容器宽高
            layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,dp2px(100))
            //设置布局方向
            orientation = LinearLayout.HORIZONTAL
            background = getDrawable(R.color.colorPrimaryDark)
            //加入父容器
            container.addView(this)
        }.apply {
            //图片
            ImageView(this@MainActivity).apply {
                layoutParams = LinearLayout.LayoutParams(
                        dp2px(120),
                        LinearLayout.LayoutParams.MATCH_PARENT
                )
                //图片资源
                setImageResource(R.drawable.az)
                //设置填充模式
                scaleType = ImageView.ScaleType.CENTER_CROP
                //添加
                addView(this)
            }

            //标题
            TextView(this@MainActivity).apply {
                layoutParams = LinearLayout.LayoutParams(
                    0,
                    LinearLayout.LayoutParams.MATCH_PARENT
                ).apply {
                    weight=1f
                    //setMargins(dp2px(10),dp2px(10),dp2px(10),dp2px(10))
                }
                text = "天使"
                setTextColor(getColor(R.color.colorWhite))
                textSize = 20f
                textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                addView(this)
            }
        }

        //第二个子控件 TextView
        TextView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            ).apply {
                setMargins(dp2px(10),dp2px(10),dp2px(10),dp2px(10))
            }
            setTextColor(getColor(R.color.colorWhite))
            text = "新浪数码讯 7月31日上午消息，数据机构Counterpoint的最新报告显示，全球智能手机出货总量在2020年第二季度同比下降24%，这是历史最快单季同比降速。但受益于中国在疫情后的快速恢复，华为出货量超越三星，到了全球第一。\n" +
                    "\n" +
                    "　　根据这份数据，全球智能手机在2020年第二季度遭遇寒冬，同比下降24%，整体出货量降至2.714亿部。华为抓住这个机会，在出货量超越了三星。\n" +
                    "\n" +
                    "　　华为去年遭遇美国制裁，但正是在这个背景下他们超越了三星，成为2020年第二季度全球智能手机市场出货量第一名。2020年第二季度，华为市场份额与三星均为20%，但华为5480万的出货量高于三星的5420万。\n" +
                    "\n" +
                    "　　Counterpoint Research副总监Tarun Pathak称：“由于新冠疫情造成的独特市场格局，华为得以实现这一壮举。与欧洲，拉美和北美等其他市场相比，中国是华为最大的市场，目前在疫情后复苏。虽然中国的智能手机出货量也同比下降了17%，但降幅小于世界其他地区的28%。受惠于复苏，华为得以继续在中国发力。目前，它的市场份额占据了在中国市场接近一半（47%），仅此一项就贡献了华为71%的出货量，而一年前为62%。然而，在中国以外的市场，其出货量同比下降了29%。华为在俄罗斯和乌克兰等东欧市场表现良好。但是随着中国以外市场的复苏，华为有可能在未来几个季度较难保持这一领先地位。”\n" +
                    "\n" +
                    "　　Counterpoint Research研究分析师Varun Mishra在评论市场动态时指出：“与第一季度相比，疫情在第二季度对智能手机市场的影响更加明显。中国这个全球最大的智能手机市场表现良好，因此，中国占全球智能手机出货量的近三分之一（31%）；这是自2017年第二季度以来的最高水平。当然，尽管中国每天的新冠疫情新增已下降到非常低的数字，不过智能手机市场仍然只恢复到了疫情前水平的85%左右，这表明消费者仍持谨慎态度。\n" +
                    "\n" +
                    "　　谈到整体市场动态时，Varun Mishra补充说：“整个季度的出货量都有所改善，6月份全球智能手机出货量比5月份反弹了34%。由于需求压抑，印度等市场在6月达到了疫情之前的水平。这是走向复苏的积极信号。”\n" +
                    "\n" +
                    "　　虽然整体市场下滑，但在中国的推动下，5G继续增长。 Counterpoint Research研究分析师Abhilash Kumar在谈到5G情景时指出：“ 5G智能手机的出货量继续在全球增长。本季度环比增长超过43%。 2020年第二季度，5G智能手机的出货渗透率从上一季度的7%提高到11%以上。这是由中国的增长推动的。中国的增长也推动了5G运营商推出更优惠的5G套餐，以及多个品牌的中端5G智能手机的上市。目前，中国占5G出货量的四分之三以上。 5G手机的价格也被华为，OPPO，vivo和小米等一起推动下降，他们都以中端价位推出5G智能手机。这将进一步推动增长并促进未来几个季度的市场复苏。”\n" +
                    "\n" +
                    "　　另外Counterpoint的这份数据还有如下要点：\n" +
                    "\n" +
                    "　　前十大品牌的总份额达到88%，而去年为80%。前十名以外的品牌同比下降55%。 新冠疫情对小品牌的影响更为严重，这些较小品牌的知名度较低，更倾向于迎合低端用户需求。\n" +
                    "\n" +
                    "　　华为继续在中国发力，并在全球数据上超越了三星，引领了全球智能手机市场。华为的发货量在全球范围内仅同比下降了3%，在中国的同比增长为11%。"
            background = getDrawable(R.color.colorPrimary)
            container.addView(this)
        }



    }

    private fun addRelativeLayout(){
        //创建RelativeLayout容器
        val relativeLayout = RelativeLayout(this).apply {
            //宽⾼
            layoutParams = RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.MATCH_PARENT
            )
            //添加id值
            id = R.id.mContainer
            //设置背景颜⾊
            background = getDrawable(R.color.colorPrimaryDark)
            //将这个容器视图添加到Activity对应的界⾯上
            setContentView(this)
        }
        //添加图⽚
        ImageView(this).apply {
            //添加ID
            id = R.id.mHeader

            layoutParams =
                    RelativeLayout.LayoutParams(dp2px(120),dp2px(90)).apply {
                        setMargins(dp2px(10),dp2px(10),0,0)
                    }
            setImageResource(R.drawable.az)
            scaleType = ImageView.ScaleType.CENTER_CROP
            relativeLayout.addView(this)
        }
        //添加标题
        TextView(this).apply {
            layoutParams = RelativeLayout.LayoutParams(0,0).apply {
                id = R.id.mTitle
                //设置和其他控件的相对关系
                //和头像的相对关系
                addRule(RelativeLayout.RIGHT_OF, R.id.mHeader)
                //和⽗容器右边对⻬
                addRule(RelativeLayout.ALIGN_PARENT_END, R.id.mContainer)
                //和头像顶部对⻬
                addRule(RelativeLayout.ALIGN_TOP, R.id.mHeader)
                //和头像底部对⻬
                addRule(RelativeLayout.ALIGN_BOTTOM, R.id.mHeader)
                //和头像的间距
                marginStart = dp2px(10)
                marginEnd = dp2px(10)
            }
            text = "天使阿追"
            setTextColor(getColor(R.color.colorWhite))
            textSize = 20f
            relativeLayout.addView(this)
        }
        //添加内容
        TextView(this).apply {
            layoutParams = RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT
                    ,0).apply {
                //设置和其他控件的相对关系
                //在头像的下⽅
                addRule(RelativeLayout.BELOW, R.id.mHeader)
                //和头像左边对⻬
                addRule(RelativeLayout.ALIGN_START, R.id.mHeader)
                //和标题的右边对⻬
                addRule(RelativeLayout.ALIGN_END, R.id.mTitle)
                //代码创建ConstraintLayout
                //和⽗容器的底部对⻬
                addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, R.id.mContainer)
                //background = getDrawable(R.color.colorWhite)
                //顶部间距
                setMargins(0,dp2px(10),0,0)
            }
            text = "新浪数码讯 7月31日上午消息，数据机构Counterpoint的最新报告显示，全球智能手机出货总量在2020年第二季度同比下降24%，这是历史最快单季同比降速。但受益于中国在疫情后的快速恢复，华为出货量超越三星，到了全球第一。\n" +
                    "\n" +
                    "　　根据这份数据，全球智能手机在2020年第二季度遭遇寒冬，同比下降24%，整体出货量降至2.714亿部。华为抓住这个机会，在出货量超越了三星。\n" +
                    "\n" +
                    "　　华为去年遭遇美国制裁，但正是在这个背景下他们超越了三星，成为2020年第二季度全球智能手机市场出货量第一名。2020年第二季度，华为市场份额与三星均为20%，但华为5480万的出货量高于三星的5420万。\n" +
                    "\n" +
                    "　　Counterpoint Research副总监Tarun Pathak称：“由于新冠疫情造成的独特市场格局，华为得以实现这一壮举。与欧洲，拉美和北美等其他市场相比，中国是华为最大的市场，目前在疫情后复苏。虽然中国的智能手机出货量也同比下降了17%，但降幅小于世界其他地区的28%。受惠于复苏，华为得以继续在中国发力。目前，它的市场份额占据了在中国市场接近一半（47%），仅此一项就贡献了华为71%的出货量，而一年前为62%。然而，在中国以外的市场，其出货量同比下降了29%。华为在俄罗斯和乌克兰等东欧市场表现良好。但是随着中国以外市场的复苏，华为有可能在未来几个季度较难保持这一领先地位。”\n" +
                    "\n" +
                    "　　Counterpoint Research研究分析师Varun Mishra在评论市场动态时指出：“与第一季度相比，疫情在第二季度对智能手机市场的影响更加明显。中国这个全球最大的智能手机市场表现良好，因此，中国占全球智能手机出货量的近三分之一（31%）；这是自2017年第二季度以来的最高水平。当然，尽管中国每天的新冠疫情新增已下降到非常低的数字，不过智能手机市场仍然只恢复到了疫情前水平的85%左右，这表明消费者仍持谨慎态度。\n" +
                    "\n" +
                    "　　谈到整体市场动态时，Varun Mishra补充说：“整个季度的出货量都有所改善，6月份全球智能手机出货量比5月份反弹了34%。由于需求压抑，印度等市场在6月达到了疫情之前的水平。这是走向复苏的积极信号。”\n" +
                    "\n" +
                    "　　虽然整体市场下滑，但在中国的推动下，5G继续增长。 Counterpoint Research研究分析师Abhilash Kumar在谈到5G情景时指出：“ 5G智能手机的出货量继续在全球增长。本季度环比增长超过43%。 2020年第二季度，5G智能手机的出货渗透率从上一季度的7%提高到11%以上。这是由中国的增长推动的。中国的增长也推动了5G运营商推出更优惠的5G套餐，以及多个品牌的中端5G智能手机的上市。目前，中国占5G出货量的四分之三以上。 5G手机的价格也被华为，OPPO，vivo和小米等一起推动下降，他们都以中端价位推出5G智能手机。这将进一步推动增长并促进未来几个季度的市场复苏。”\n" +
                    "\n" +
                    "　　另外Counterpoint的这份数据还有如下要点：\n" +
                    "\n" +
                    "　　前十大品牌的总份额达到88%，而去年为80%。前十名以外的品牌同比下降55%。 新冠疫情对小品牌的影响更为严重，这些较小品牌的知名度较低，更倾向于迎合低端用户需求。\n" +
                    "\n" +
                    "　　华为继续在中国发力，并在全球数据上超越了三星，引领了全球智能手机市场。华为的发货量在全球范围内仅同比下降了3%，在中国的同比增长为11%。"

            setTextColor(getColor(R.color.colorWhite))
            textSize = 20f
            relativeLayout.addView(this)
        }
    }

    private fun addConstraintLayout() {
        val constraintLayout = ConstraintLayout(this).apply {
            id = R.id.mContainer
            layoutParams = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.MATCH_PARENT,
                    ConstraintLayout.LayoutParams.MATCH_PARENT
            )
            background = getDrawable(R.color.colorPrimaryDark)
            setContentView(this)
        }
        ImageView(this).apply {
            id = R.id.mHeader
            layoutParams = ConstraintLayout.LayoutParams(dp2px(120),
                    dp2px(90)).apply {
//左边和⽗容器对⻬
                leftToLeft = R.id.mContainer
//顶部和⽗容器对⻬
                topToTop = R.id.mContainer
                setMargins(dp2px(10), dp2px(10), 0, 0)
            }
            setImageResource(R.drawable.az)
            scaleType = ImageView.ScaleType.CENTER_CROP
            constraintLayout.addView(this)
        }
        TextView(this).apply {
            id = R.id.mTitle
            layoutParams = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
                    ConstraintLayout.LayoutParams.MATCH_CONSTRAINT
            ).apply {
                leftToRight = R.id.mHeader
                rightToRight = R.id.mContainer
                topToTop = R.id.mHeader
                bottomToBottom = R.id.mHeader
                setMargins(dp2px(10), 0, dp2px(10), 0)
            }
            text = "美国计划再买4艘医疗船抗击新冠疫情 此前2艘仅收治200余名患者"
            setTextColor(getColor(R.color.colorWhite))
            textSize = 20f
            constraintLayout.addView(this)
        }
        TextView(this).apply {
            layoutParams = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
                    ConstraintLayout.LayoutParams.MATCH_CONSTRAINT
            ).apply {
                leftToLeft = R.id.mHeader
                rightToRight = R.id.mTitle
                topToBottom = R.id.mHeader
                bottomToBottom = R.id.mContainer
                setMargins(0, dp2px(10), 0, 0)
            }
            text = "新浪数码讯 7月31日上午消息，数据机构Counterpoint的最新报告显示，全球智能手机出货总量在2020年第二季度同比下降24%，这是历史最快单季同比降速。但受益于中国在疫情后的快速恢复，华为出货量超越三星，到了全球第一。\n" +
                    "\n" +
                    "　　根据这份数据，全球智能手机在2020年第二季度遭遇寒冬，同比下降24%，整体出货量降至2.714亿部。华为抓住这个机会，在出货量超越了三星。\n" +
                    "\n" +
                    "　　华为去年遭遇美国制裁，但正是在这个背景下他们超越了三星，成为2020年第二季度全球智能手机市场出货量第一名。2020年第二季度，华为市场份额与三星均为20%，但华为5480万的出货量高于三星的5420万。\n" +
                    "\n" +
                    "　　Counterpoint Research副总监Tarun Pathak称：“由于新冠疫情造成的独特市场格局，华为得以实现这一壮举。与欧洲，拉美和北美等其他市场相比，中国是华为最大的市场，目前在疫情后复苏。虽然中国的智能手机出货量也同比下降了17%，但降幅小于世界其他地区的28%。受惠于复苏，华为得以继续在中国发力。目前，它的市场份额占据了在中国市场接近一半（47%），仅此一项就贡献了华为71%的出货量，而一年前为62%。然而，在中国以外的市场，其出货量同比下降了29%。华为在俄罗斯和乌克兰等东欧市场表现良好。但是随着中国以外市场的复苏，华为有可能在未来几个季度较难保持这一领先地位。”\n" +
                    "\n" +
                    "　　Counterpoint Research研究分析师Varun Mishra在评论市场动态时指出：“与第一季度相比，疫情在第二季度对智能手机市场的影响更加明显。中国这个全球最大的智能手机市场表现良好，因此，中国占全球智能手机出货量的近三分之一（31%）；这是自2017年第二季度以来的最高水平。当然，尽管中国每天的新冠疫情新增已下降到非常低的数字，不过智能手机市场仍然只恢复到了疫情前水平的85%左右，这表明消费者仍持谨慎态度。\n" +
                    "\n" +
                    "　　谈到整体市场动态时，Varun Mishra补充说：“整个季度的出货量都有所改善，6月份全球智能手机出货量比5月份反弹了34%。由于需求压抑，印度等市场在6月达到了疫情之前的水平。这是走向复苏的积极信号。”\n" +
                    "\n" +
                    "　　虽然整体市场下滑，但在中国的推动下，5G继续增长。 Counterpoint Research研究分析师Abhilash Kumar在谈到5G情景时指出：“ 5G智能手机的出货量继续在全球增长。本季度环比增长超过43%。 2020年第二季度，5G智能手机的出货渗透率从上一季度的7%提高到11%以上。这是由中国的增长推动的。中国的增长也推动了5G运营商推出更优惠的5G套餐，以及多个品牌的中端5G智能手机的上市。目前，中国占5G出货量的四分之三以上。 5G手机的价格也被华为，OPPO，vivo和小米等一起推动下降，他们都以中端价位推出5G智能手机。这将进一步推动增长并促进未来几个季度的市场复苏。”\n" +
                    "\n" +
                    "　　另外Counterpoint的这份数据还有如下要点：\n" +
                    "\n" +
                    "　　前十大品牌的总份额达到88%，而去年为80%。前十名以外的品牌同比下降55%。 新冠疫情对小品牌的影响更为严重，这些较小品牌的知名度较低，更倾向于迎合低端用户需求。\n" +
                    "\n" +
                    "　　华为继续在中国发力，并在全球数据上超越了三星，引领了全球智能手机市场。华为的发货量在全球范围内仅同比下降了3%，在中国的同比增长为11%。"

            setTextColor(getColor(R.color.colorWhite))
            textSize = 20f
            constraintLayout.addView(this)
        }
    }

    fun dp2px(dp:Int):Int{
        return (resources.displayMetrics.density * dp).toInt()
    }
}