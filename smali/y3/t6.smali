.class final Ly3/t6;
.super Ly3/u6;
.source "SourceFile"


# static fields
.field private static final v:Ly3/t6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly3/t6;

    const-string v1, "unusedTag"

    invoke-direct {v0, v1}, Ly3/t6;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly3/t6;->v:Ly3/t6;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string p1, "unusedTag"

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ly3/u6;-><init>(Ljava/lang/String;Ly3/s6;)V

    return-void
.end method

.method static synthetic O()Ly3/t6;
    .locals 1

    sget-object v0, Ly3/t6;->v:Ly3/t6;

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic c()Ly3/u6;
    .locals 0

    return-object p0
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final e(J)V
    .locals 0

    return-void
.end method

.method public final i(J)V
    .locals 0

    return-void
.end method
