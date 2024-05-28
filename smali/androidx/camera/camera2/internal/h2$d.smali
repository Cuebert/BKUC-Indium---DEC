.class final enum Landroidx/camera/camera2/internal/h2$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/camera2/internal/h2$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Landroidx/camera/camera2/internal/h2$d;

.field public static final enum o:Landroidx/camera/camera2/internal/h2$d;

.field public static final enum p:Landroidx/camera/camera2/internal/h2$d;

.field public static final enum q:Landroidx/camera/camera2/internal/h2$d;

.field public static final enum r:Landroidx/camera/camera2/internal/h2$d;

.field private static final synthetic s:[Landroidx/camera/camera2/internal/h2$d;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Landroidx/camera/camera2/internal/h2$d;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/h2$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/h2$d;->n:Landroidx/camera/camera2/internal/h2$d;

    .line 2
    new-instance v1, Landroidx/camera/camera2/internal/h2$d;

    const-string v3, "SESSION_INITIALIZED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Landroidx/camera/camera2/internal/h2$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Landroidx/camera/camera2/internal/h2$d;->o:Landroidx/camera/camera2/internal/h2$d;

    .line 3
    new-instance v3, Landroidx/camera/camera2/internal/h2$d;

    const-string v5, "ON_CAPTURE_SESSION_STARTED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Landroidx/camera/camera2/internal/h2$d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Landroidx/camera/camera2/internal/h2$d;->p:Landroidx/camera/camera2/internal/h2$d;

    .line 4
    new-instance v5, Landroidx/camera/camera2/internal/h2$d;

    const-string v7, "ON_CAPTURE_SESSION_ENDED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Landroidx/camera/camera2/internal/h2$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Landroidx/camera/camera2/internal/h2$d;->q:Landroidx/camera/camera2/internal/h2$d;

    .line 5
    new-instance v7, Landroidx/camera/camera2/internal/h2$d;

    const-string v9, "CLOSED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Landroidx/camera/camera2/internal/h2$d;-><init>(Ljava/lang/String;I)V

    sput-object v7, Landroidx/camera/camera2/internal/h2$d;->r:Landroidx/camera/camera2/internal/h2$d;

    const/4 v9, 0x5

    new-array v9, v9, [Landroidx/camera/camera2/internal/h2$d;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Landroidx/camera/camera2/internal/h2$d;->s:[Landroidx/camera/camera2/internal/h2$d;

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

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/camera2/internal/h2$d;
    .locals 1

    const-class v0, Landroidx/camera/camera2/internal/h2$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/camera2/internal/h2$d;

    return-object p0
.end method

.method public static values()[Landroidx/camera/camera2/internal/h2$d;
    .locals 1

    sget-object v0, Landroidx/camera/camera2/internal/h2$d;->s:[Landroidx/camera/camera2/internal/h2$d;

    invoke-virtual {v0}, [Landroidx/camera/camera2/internal/h2$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/camera2/internal/h2$d;

    return-object v0
.end method
