.class final enum Lcom/google/common/util/concurrent/h;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/common/util/concurrent/h;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum n:Lcom/google/common/util/concurrent/h;

.field private static final synthetic o:[Lcom/google/common/util/concurrent/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/common/util/concurrent/h;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/common/util/concurrent/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/util/concurrent/h;->n:Lcom/google/common/util/concurrent/h;

    .line 2
    invoke-static {}, Lcom/google/common/util/concurrent/h;->b()[Lcom/google/common/util/concurrent/h;

    move-result-object v0

    sput-object v0, Lcom/google/common/util/concurrent/h;->o:[Lcom/google/common/util/concurrent/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic b()[Lcom/google/common/util/concurrent/h;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/common/util/concurrent/h;

    sget-object v1, Lcom/google/common/util/concurrent/h;->n:Lcom/google/common/util/concurrent/h;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/util/concurrent/h;
    .locals 1

    const-class v0, Lcom/google/common/util/concurrent/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/common/util/concurrent/h;

    return-object p0
.end method

.method public static values()[Lcom/google/common/util/concurrent/h;
    .locals 1

    sget-object v0, Lcom/google/common/util/concurrent/h;->o:[Lcom/google/common/util/concurrent/h;

    invoke-virtual {v0}, [Lcom/google/common/util/concurrent/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/util/concurrent/h;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MoreExecutors.directExecutor()"

    return-object v0
.end method
