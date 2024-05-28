.class public final enum Ld8/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld8/f$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Ld8/f$a;

.field public static final enum o:Ld8/f$a;

.field private static final synthetic p:[Ld8/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ld8/f$a;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld8/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld8/f$a;->n:Ld8/f$a;

    new-instance v1, Ld8/f$a;

    const-string v3, "POST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ld8/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ld8/f$a;->o:Ld8/f$a;

    const/4 v3, 0x2

    new-array v3, v3, [Ld8/f$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 2
    sput-object v3, Ld8/f$a;->p:[Ld8/f$a;

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

.method public static valueOf(Ljava/lang/String;)Ld8/f$a;
    .locals 1

    const-class v0, Ld8/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld8/f$a;

    return-object p0
.end method

.method public static values()[Ld8/f$a;
    .locals 1

    sget-object v0, Ld8/f$a;->p:[Ld8/f$a;

    invoke-virtual {v0}, [Ld8/f$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld8/f$a;

    return-object v0
.end method
