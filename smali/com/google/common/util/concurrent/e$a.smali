.class final enum Lcom/google/common/util/concurrent/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/util/concurrent/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/common/util/concurrent/e$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lcom/google/common/util/concurrent/e$a;

.field public static final enum o:Lcom/google/common/util/concurrent/e$a;

.field private static final synthetic p:[Lcom/google/common/util/concurrent/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/common/util/concurrent/e$a;

    const-string v1, "OUTPUT_FUTURE_DONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/common/util/concurrent/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/util/concurrent/e$a;->n:Lcom/google/common/util/concurrent/e$a;

    .line 2
    new-instance v0, Lcom/google/common/util/concurrent/e$a;

    const-string v1, "ALL_INPUT_FUTURES_PROCESSED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/common/util/concurrent/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/util/concurrent/e$a;->o:Lcom/google/common/util/concurrent/e$a;

    .line 3
    invoke-static {}, Lcom/google/common/util/concurrent/e$a;->b()[Lcom/google/common/util/concurrent/e$a;

    move-result-object v0

    sput-object v0, Lcom/google/common/util/concurrent/e$a;->p:[Lcom/google/common/util/concurrent/e$a;

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

.method private static synthetic b()[Lcom/google/common/util/concurrent/e$a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/common/util/concurrent/e$a;

    sget-object v1, Lcom/google/common/util/concurrent/e$a;->n:Lcom/google/common/util/concurrent/e$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/common/util/concurrent/e$a;->o:Lcom/google/common/util/concurrent/e$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/util/concurrent/e$a;
    .locals 1

    const-class v0, Lcom/google/common/util/concurrent/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/common/util/concurrent/e$a;

    return-object p0
.end method

.method public static values()[Lcom/google/common/util/concurrent/e$a;
    .locals 1

    sget-object v0, Lcom/google/common/util/concurrent/e$a;->p:[Lcom/google/common/util/concurrent/e$a;

    invoke-virtual {v0}, [Lcom/google/common/util/concurrent/e$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/util/concurrent/e$a;

    return-object v0
.end method
