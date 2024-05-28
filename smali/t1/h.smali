.class Lt1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private a:Lt1/b;

.field private b:Lt1/b;

.field public final c:Ljava/lang/String;

.field private final d:Lt1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lt1/h;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Lt1/c;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lt1/h;->a:Lt1/b;

    .line 3
    iput-object v0, p0, Lt1/h;->b:Lt1/b;

    .line 4
    iput-object p1, p0, Lt1/h;->d:Lt1/c;

    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "_"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lt1/h;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lt1/h;->c:Ljava/lang/String;

    return-void
.end method

.method private b(Lt1/b;Lt1/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/h;->b:Lt1/b;

    if-ne v0, p2, :cond_0

    .line 2
    iput-object p1, p0, Lt1/h;->b:Lt1/b;

    :cond_0
    if-nez p1, :cond_1

    .line 3
    iget-object p1, p2, Lt1/b;->b:Lt1/b;

    iput-object p1, p0, Lt1/h;->a:Lt1/b;

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p2, Lt1/b;->b:Lt1/b;

    iput-object v0, p1, Lt1/b;->b:Lt1/b;

    .line 5
    :goto_0
    iget-object p1, p0, Lt1/h;->d:Lt1/c;

    invoke-virtual {p1, p2}, Lt1/c;->b(Lt1/b;)V

    return-void
.end method


# virtual methods
.method a()Lt1/b;
    .locals 4

    .line 1
    iget-object v0, p0, Lt1/h;->a:Lt1/b;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 2
    iget-object v2, p0, Lt1/h;->c:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const-string v2, "[%s] remove message %s"

    invoke-static {v2, v1}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, v0, Lt1/b;->b:Lt1/b;

    iput-object v1, p0, Lt1/h;->a:Lt1/b;

    .line 4
    iget-object v1, p0, Lt1/h;->b:Lt1/b;

    if-ne v1, v0, :cond_0

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lt1/h;->b:Lt1/b;

    :cond_0
    return-object v0
.end method

.method protected c(Lcom/birbit/android/jobqueue/messaging/MessagePredicate;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lt1/h;->a:Lt1/b;

    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 2
    invoke-interface {p1, v0}, Lcom/birbit/android/jobqueue/messaging/MessagePredicate;->onMessage(Lt1/b;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    iget-object v2, v0, Lt1/b;->b:Lt1/b;

    .line 4
    invoke-direct {p0, v1, v0}, Lt1/h;->b(Lt1/b;Lt1/b;)V

    move-object v0, v2

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, v0, Lt1/b;->b:Lt1/b;

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method public clear()V
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, Lt1/h;->a:Lt1/b;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, v0, Lt1/b;->b:Lt1/b;

    iput-object v1, p0, Lt1/h;->a:Lt1/b;

    .line 3
    iget-object v1, p0, Lt1/h;->d:Lt1/c;

    invoke-virtual {v1, v0}, Lt1/c;->b(Lt1/b;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lt1/h;->b:Lt1/b;

    return-void
.end method

.method protected post(Lt1/b;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Lt1/h;->c:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string v1, "[%s] post message %s"

    invoke-static {v1, v0}, Ls1/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lt1/h;->b:Lt1/b;

    if-nez v0, :cond_0

    .line 3
    iput-object p1, p0, Lt1/h;->a:Lt1/b;

    .line 4
    iput-object p1, p0, Lt1/h;->b:Lt1/b;

    goto :goto_0

    .line 5
    :cond_0
    iput-object p1, v0, Lt1/b;->b:Lt1/b;

    .line 6
    iput-object p1, p0, Lt1/h;->b:Lt1/b;

    :goto_0
    return-void
.end method
