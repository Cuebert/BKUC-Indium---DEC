.class final Lcom/google/common/util/concurrent/a$l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/util/concurrent/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "l"
.end annotation


# static fields
.field static final c:Lcom/google/common/util/concurrent/a$l;


# instance fields
.field volatile a:Ljava/lang/Thread;

.field volatile b:Lcom/google/common/util/concurrent/a$l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/common/util/concurrent/a$l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/common/util/concurrent/a$l;-><init>(Z)V

    sput-object v0, Lcom/google/common/util/concurrent/a$l;->c:Lcom/google/common/util/concurrent/a$l;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/google/common/util/concurrent/a;->c()Lcom/google/common/util/concurrent/a$b;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/google/common/util/concurrent/a$b;->g(Lcom/google/common/util/concurrent/a$l;Ljava/lang/Thread;)V

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/google/common/util/concurrent/a$l;)V
    .locals 1

    invoke-static {}, Lcom/google/common/util/concurrent/a;->c()Lcom/google/common/util/concurrent/a$b;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/common/util/concurrent/a$b;->f(Lcom/google/common/util/concurrent/a$l;Lcom/google/common/util/concurrent/a$l;)V

    return-void
.end method

.method b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/common/util/concurrent/a$l;->a:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, Lcom/google/common/util/concurrent/a$l;->a:Ljava/lang/Thread;

    .line 3
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
