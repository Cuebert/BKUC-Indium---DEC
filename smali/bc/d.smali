.class public Lbc/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final k:Ljava/util/concurrent/ExecutorService;


# instance fields
.field a:Z

.field b:Z

.field c:Z

.field d:Z

.field e:Z

.field f:Z

.field g:Z

.field h:Z

.field i:Ljava/util/concurrent/ExecutorService;

.field j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcc/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lbc/d;->k:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lbc/d;->a:Z

    .line 3
    iput-boolean v0, p0, Lbc/d;->b:Z

    .line 4
    iput-boolean v0, p0, Lbc/d;->c:Z

    .line 5
    iput-boolean v0, p0, Lbc/d;->d:Z

    .line 6
    iput-boolean v0, p0, Lbc/d;->f:Z

    .line 7
    sget-object v0, Lbc/d;->k:Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Lbc/d;->i:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public a()Lbc/c;
    .locals 1

    new-instance v0, Lbc/c;

    invoke-direct {v0, p0}, Lbc/c;-><init>(Lbc/d;)V

    return-object v0
.end method
