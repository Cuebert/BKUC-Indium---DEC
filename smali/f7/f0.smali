.class public final enum Lf7/f0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf7/f0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lf7/f0;

.field public static final enum o:Lf7/f0;

.field private static final synthetic p:[Lf7/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lf7/f0;

    const-string v1, "EXPERIENCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf7/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf7/f0;->n:Lf7/f0;

    .line 2
    new-instance v1, Lf7/f0;

    const-string v3, "APP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lf7/f0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lf7/f0;->o:Lf7/f0;

    const/4 v3, 0x2

    new-array v3, v3, [Lf7/f0;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lf7/f0;->p:[Lf7/f0;

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

.method public static valueOf(Ljava/lang/String;)Lf7/f0;
    .locals 1

    const-class v0, Lf7/f0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf7/f0;

    return-object p0
.end method

.method public static values()[Lf7/f0;
    .locals 1

    sget-object v0, Lf7/f0;->p:[Lf7/f0;

    invoke-virtual {v0}, [Lf7/f0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf7/f0;

    return-object v0
.end method
