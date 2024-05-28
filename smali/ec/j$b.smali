.class final enum Lec/j$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lec/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lec/j$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lec/j$b;

.field public static final enum o:Lec/j$b;

.field private static final synthetic p:[Lec/j$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lec/j$b;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lec/j$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lec/j$b;->n:Lec/j$b;

    .line 2
    new-instance v1, Lec/j$b;

    const-string v3, "RUNNING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lec/j$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lec/j$b;->o:Lec/j$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lec/j$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lec/j$b;->p:[Lec/j$b;

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

.method public static valueOf(Ljava/lang/String;)Lec/j$b;
    .locals 1

    const-class v0, Lec/j$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lec/j$b;

    return-object p0
.end method

.method public static values()[Lec/j$b;
    .locals 1

    sget-object v0, Lec/j$b;->p:[Lec/j$b;

    invoke-virtual {v0}, [Lec/j$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lec/j$b;

    return-object v0
.end method
