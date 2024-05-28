.class public interface abstract Lz/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/a2;


# static fields
.field public static final y:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Landroidx/camera/core/y2$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Landroidx/camera/core/y2$b;

    const-string v1, "camerax.core.useCaseEventCallback"

    .line 2
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lz/m;->y:Lw/o0$a;

    return-void
.end method


# virtual methods
.method public abstract D(Landroidx/camera/core/y2$b;)Landroidx/camera/core/y2$b;
.end method
