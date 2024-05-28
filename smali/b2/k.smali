.class Lb2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb2/k$a;
    }
.end annotation


# instance fields
.field private final a:Lb2/k$a;

.field private final b:Lb2/i;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb2/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Lb2/i;)V
    .locals 1

    .line 1
    new-instance v0, Lb2/k$a;

    invoke-direct {v0, p1}, Lb2/k$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Lb2/k;-><init>(Lb2/k$a;Lb2/i;)V

    return-void
.end method

.method constructor <init>(Lb2/k$a;Lb2/i;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb2/k;->c:Ljava/util/Map;

    .line 4
    iput-object p1, p0, Lb2/k;->a:Lb2/k$a;

    .line 5
    iput-object p2, p0, Lb2/k;->b:Lb2/i;

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)Lb2/m;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lb2/k;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lb2/k;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb2/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    .line 3
    :cond_0
    :try_start_1
    iget-object v0, p0, Lb2/k;->a:Lb2/k$a;

    invoke-virtual {v0, p1}, Lb2/k$a;->b(Ljava/lang/String;)Lb2/d;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    .line 4
    monitor-exit p0

    return-object p1

    .line 5
    :cond_1
    :try_start_2
    iget-object v1, p0, Lb2/k;->b:Lb2/i;

    invoke-virtual {v1, p1}, Lb2/i;->a(Ljava/lang/String;)Lb2/h;

    move-result-object v1

    invoke-interface {v0, v1}, Lb2/d;->create(Lb2/h;)Lb2/m;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lb2/k;->c:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 7
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
