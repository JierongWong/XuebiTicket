(function(){
	var movies = [
	{
		id:"0",
		name: "愤怒的小鸟",
		grade: "8.8",
		playdate: "2016-05-21",
		imgSrc:"./img/0.jpg",
		director: "弗加尔·赖利,克莱·凯提斯",
		actors: "杰森·苏戴奇斯 / 乔什·加德 / 丹尼·麦克布耐德 / 玛娅·鲁道夫 / 西恩·潘 / 凯特·麦克金农 / 彼特·丁克拉奇 / 比尔·哈德尔 / 托尼·海尔 / 丹尼尔·布鲁克斯 / 吉莉恩·贝尔 / 科甘-迈克尔·凯 / 伊克·巴里霍尔兹 / 吉奥弗瑞·阿伦德 / 麦克斯·查尔斯 / 布莱克·谢尔顿 / 泰塔斯·伯吉斯 / 汉尼拔·布勒斯 / Cristela Alonzo / Anthony Padilla / Billy Eichner",
		movielanguage: "英文",
		movieclass: "动作,喜剧,动画",
		moviecountry: "美国,芬兰",
		movietime: "90分钟",
		inshort_description:"卖萌有理萌哭无罪",
		introduction: "讲述一群不会飞的小鸟，挤在一座热带小岛上，和睦宁静。游戏中的几个经典形象成了影片的主角，分别是易怒的小鸟大红（杰森·苏戴奇斯 配音），速度小鸟恰克（乔什·盖德 配音）、炸弹（丹尼·麦克布耐德 配音）。当神秘的绿色小猪登陆岛屿时，小鸟们平静的生活被打破了。"
	},
	{
		id: "1",
		name: "分歧者3：忠诚世界",
		grade: "8.2",
		playdate: "2016-05-20",
		imgSrc: "./img/1.jpg",
		director: "罗伯特·斯文克",
		actors: "略...",
		movielanguage:"略...",
		movieclass: "略...",
		moviecountry: "略...",
		movietime: "略...",
		inshort_description:"略...",
		introduction: "在推翻了派系制度之后，翠丝（谢琳·伍德蕾 Shailene Woodley 饰）与老四（提奥·詹姆斯 Theo James 饰）带领众人翻越了芝加哥的围墙来到全新世界。然而看似美好的新世界却隐藏着更大的杀机，翠丝与老四之间的信任也遭受到前所未有的考验。二人能否从阴谋中脱身并守住彼此？"
	},
	{
		id: "2",
		name: "魔兽",
		grade: "8.6",
		playdate: "2016-06-08",
		imgSrc: "./img/2.jpg",
		director: '邓肯·琼斯',
		actors: "略...",
		movielanguage: "略...",
		movieclass: "略...",
		moviecountry: "略...",
		movietime: "略...",
		inshort_description:"略...",
		introduction: '兽人部落即将消亡，为了生存，他们开始与人类王国作战。然而，无论联盟还是部落，他们面临的威胁远不止彼此。为了对抗即将到来的黑暗势力，人类联盟的安杜因（崔维斯·费米尔 饰）与兽人部落的杜隆坦（托比·凯贝尔 饰）决定联手，昔日的仇敌，为了各自的存亡，为了整个艾泽拉斯大陆，终于开始并肩作战。'
	},
	{
		id:'3',
		name:'美国队长3',
		grade: '8.5',
		playdate: '2016-05-06',
		imgSrc: './img/3.jpg',
		director: '乔·罗素,安东尼·罗素',
		actors: "略...",
		movielanguage: "略...",
		movieclass: "略...",
		moviecountry: "略...",
		movietime: "略...",
		inshort_description:"略...",
		introduction: '奥创纪元之后，全球政府联合颁布法令，管控超能力活动。对这条法令的不同态度，使复仇者阵营一分为二，钢铁侠和美国队长各据一方，其他复仇者则不得不做出自己的选择，最终引发前任盟友间的史诗大战。'
	},
	{
		id: '4',
		name: 'X战警：天启',
		grade: '8.1',
		playdate: '2016-06-03',
		imgSrc: './img/4.jpg',
		director: '布莱恩·辛格',
		actors: "略...",
		movielanguage: "略...",
		movieclass: "略...",
		moviecountry: "略...",
		movietime: "略...",
		inshort_description:"略...",
		introduction: ' 文明曙光初现时，有人被尊为神明，名为天启（奥斯卡·伊萨克 饰）。他是最强大的变种人，身上集合了众多变种人的能力，长生不朽，不可战胜。沉睡数千年之后，当他再次醒来，却对世界感到深深的失望，于是召集了一批强大的变种人，包括灰心丧气的万磁王（迈克尔·法斯宾德 饰），来清除人类，建立新的世界秩序，而他将成为新世界的主宰。整个世界命悬一线，魔形女瑞雯（詹妮弗·劳伦斯 饰）在X教授（詹姆斯·麦卡沃伊 饰）的协助下，必须带领年轻的X战警，阻止神明般强大的敌人的阴谋，将人类从灭种的命运中拯救出来。'
	},
	{
		id: '5',
		name: '百鸟朝凤',
		imgSrc: './img/5.jpg',
		grade: '9.1',
		playdate: '2016-05-06',
		director: '吴天明',
		actors: "略...",
		movielanguage: "略...",
		movieclass: "略...",
		moviecountry: "略...",
		movietime: "略...",
		inshort_description:"略...",
		introduction: '老一代唢呐艺人焦三爷（陶泽如 饰）是个外冷内热的老人，看起来严肃古板，其实心怀热血。影片表现了在社会变革、民心浮躁的年代里，新老两代唢呐艺人为了信念的坚守所产生的真挚的师徒情、父子情、兄弟情。'
	},
	{
		id: '6',
		name: '泰国妖医',
		imgSrc: './img/6.jpg',
		grade: '6.5',
		playdate: '2016-05-27',
		director: '吴宗强',
		actors: "略...",
		movielanguage: "略...",
		movieclass: "略...",
		moviecountry: "略...",
		movietime: "略...",
		inshort_description:"略...",
		introduction: '泰国魅力美女邢潇(POYD饰演)从小和双胞胎姐姐邢慧分离，她和男友沙青为了找回邢慧用尽了各种努力。在这过程中邢潇邂逅了陈永霖。好奇和悲悯让陈永霖介入了沙青和邢潇的生活。当他陷入邢潇的情网之后，才发现，这只是一个处处设防，步步惊心的迷局。'
	},
	{
		id: '7',
		name: '糖果世界大冒险',
		imgSrc: './img/7.jpg',
		grade: '7.9',
		playdate: '2016-05-27',
		director: '徐克',
		actors: "略...",
		movielanguage: "略...",
		movieclass: "略...",
		moviecountry: "略...",
		movietime: "略...",
		inshort_description:"略...",
		instruction: ' 本片讲述的是一个小学生成长的故事。地球籍小学生小雨（安琪 国语配音）一直想成为朋友中的领袖，和绿林星球的小伙伴们一起努力，共同完成一个任务。一次意外，妈妈陷入困境，如果不在有限的时间内完成拯救，妈妈将永远回不来。为了救回妈妈，小雨带领她绿林星球的朋友组成的团队来到糖果世界。原本就是临时拼凑起来的团队，在生性固执的小雨的带领下，团队很快陷入糖果世界主人咕噜的阴谋中。而心焦如煎的小雨却不顾团队成员的阻拦，试图以一己之力挽救局势，但这只能让她滑进咕噜为之设计的深渊。跌入低谷后，小雨终于领悟了“信任”才是友谊的关键，但时间已经所剩无几……最终，她能成功的扭转局势、拯救大家脱困吗？'
	},
	{
		id: '8',
		name: '北京遇上西雅图之不二情书',
		imgSrc: './img/8.jpg',
		grade: '8.6',
		playdate: '2016-04-29',
		director: '薛晓路' ,
		actors: "略...",
		movielanguage: "略...",
		movieclass: "略...",
		moviecountry: "略...",
		movietime: "略...",
		inshort_description:"略...",
		instruction: "《不二情书》并不是《北京遇上西雅图》的续集，而是讲述了一个全新的故事。 　　汤唯饰演的少女以赌场为家，遇上吴秀波饰演的房产经纪人，千百次错过，终换来一见钟情......"
	}
	];
	
	// 给影院添加了 breifadderss -- 大概位置
	var theaters = [
		{
			id: "0",
			name: '星美国际影城(松江店)',
			imgSrc: './img/t0.jpg',
			breifaddress: '海珠区',
			address: '松江区环城路515-555号LOMO玩库3楼',
			traffic: '松江2路,松江1路',
			telephone: '37770608'
		},
		{
			id: '1',
			name: 'UME国际影城(宝山店)',
			imgSrc: './img/t1.jpg',
			breifaddress: '宝山区',
			address: '宝山区牡丹江路318号诺亚新天地广场D栋四楼',
			traffic: '宝山1路、116、116B',
			telephone: 36555580
		},
		{
			id: '2',
			name: '海上明珠国际影城(联洋店)',
			imgSrc: './img/t2.jpg',
			breifaddress: '浦东新区',
			address: '浦东新区芳甸路226号联洋广场2',
			traffic: '',
			telephone: '61821388',
		},
		{
			id:'3',
			name: '海上国际影城(月星环球港店)座',
			imgSrc: './img/t3.jpg',
			breifaddress: '普陀区',
			address: '普陀区中山北路3300号环球港4楼',
			traffic: ' 公交车：224路 67路 909路 829路',
			telephone: '60670960'
		}
	];
	
	// 返回的大概位置集电影院数量
	var Baddresses = [
		{
			b_adderss: '荔湾区',
			num: '(4)'
		},
		{
			b_adderss: '普陀区',
			num: '(6)'
		}
	];
	
	// 一个电影院关于某场电影的详细信息
	var theaterAboutmovie = [
		{
			id:0,
			playDate:"6月1号", // 放映日期
			details:[
				{
					beginTime: "20:30", // 场次
					endTime: "21:40", // 结束时间
					language_type: "英文/普通3D", // 语言/版本
					playgroud: "3号厅", //放映厅
					cost:"￥39" //价格
				},
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				},
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				},
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				}
			]
		},
		{
			id:1,
			playDate:"6月2号",
			details:[
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				},
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				},
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				},
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				}
			]
		},
		{
			id:2,
			playDate:"6月3号",
			details:[
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				},
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				},
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				},
				{
					beginTime: "20:30",
					endTime: "21:40",
					language_type: "英文/普通3D",
					playgroud: "3号厅",
					cost:"￥39"
				}
			]
		}
	];
	

	function getMovieById(id) {
		for(index in movies) {
			if(movies[index].id === id) {
				return movies[index];
			}
		}
		return null;
	}

	function getAllMovies() {
		return movies;
	}
	function getAllTheaters() {
		return theaters;
	}
	function getAllB_adderss(){
		return Baddresses;
	}
	
	function getALLTheaterDetail(){
		return theaterAboutmovie;
	}
	window.mock = {
		getAllMovies: getAllMovies,
		getMovieById: getMovieById,
		getAllTheaters: getAllTheaters,
		getAllB_addresses: getAllB_adderss,
		getAllTheaterDetail: getALLTheaterDetail
	}
})()