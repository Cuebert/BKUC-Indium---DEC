.class final enum Lf8/h$m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "m"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf8/h$m;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lf8/h$m;

.field public static final enum o:Lf8/h$m;

.field public static final enum p:Lf8/h$m;

.field private static final synthetic q:[Lf8/h$m;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lf8/h$m;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf8/h$m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf8/h$m;->n:Lf8/h$m;

    .line 2
    new-instance v1, Lf8/h$m;

    const-string v3, "CONNECTING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lf8/h$m;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lf8/h$m;->o:Lf8/h$m;

    .line 3
    new-instance v3, Lf8/h$m;

    const-string v5, "READY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lf8/h$m;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lf8/h$m;->p:Lf8/h$m;

    const/4 v5, 0x3

    new-array v5, v5, [Lf8/h$m;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lf8/h$m;->q:[Lf8/h$m;

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

.method public static valueOf(Ljava/lang/String;)Lf8/h$m;
    .locals 1

    const-class v0, Lf8/h$m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf8/h$m;

    return-object p0
.end method

.method public static values()[Lf8/h$m;
    .locals 1

    sget-object v0, Lf8/h$m;->q:[Lf8/h$m;

    invoke-virtual {v0}, [Lf8/h$m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf8/h$m;

    return-object v0
.end method
