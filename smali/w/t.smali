.class public interface abstract Lw/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/a2;


# static fields
.field public static final a:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/p2;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/y0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/d2;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lw/p2;

    const-string v1, "camerax.core.camera.useCaseConfigFactory"

    .line 2
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/t;->a:Lw/o0$a;

    .line 3
    const-class v0, Lw/y0;

    const-string v1, "camerax.core.camera.compatibilityId"

    .line 4
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/t;->b:Lw/o0$a;

    .line 5
    const-class v0, Ljava/lang/Integer;

    const-string v1, "camerax.core.camera.useCaseCombinationRequiredRule"

    .line 6
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/t;->c:Lw/o0$a;

    .line 7
    const-class v0, Lw/d2;

    const-string v1, "camerax.core.camera.SessionProcessor"

    .line 8
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/t;->d:Lw/o0$a;

    .line 9
    const-class v0, Ljava/lang/Boolean;

    const-string v1, "camerax.core.camera.isZslDisabled"

    .line 10
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/t;->e:Lw/o0$a;

    return-void
.end method


# virtual methods
.method public abstract C()Ljava/lang/Boolean;
.end method

.method public abstract F()I
.end method

.method public abstract h()Lw/p2;
.end method

.method public abstract p(Lw/d2;)Lw/d2;
.end method

.method public abstract s()Lw/y0;
.end method
