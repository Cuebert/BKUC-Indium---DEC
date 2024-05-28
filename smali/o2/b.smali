.class public final Lo2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Lo2/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ls2/a;

.field public static final c:Lx2/a$g;

.field private static final d:Lx2/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx2/a$g;

    invoke-direct {v0}, Lx2/a$g;-><init>()V

    sput-object v0, Lo2/b;->c:Lx2/a$g;

    .line 2
    new-instance v1, Lo2/f;

    invoke-direct {v1}, Lo2/f;-><init>()V

    sput-object v1, Lo2/b;->d:Lx2/a$a;

    .line 3
    new-instance v2, Lx2/a;

    const-string v3, "Auth.PROXY_API"

    invoke-direct {v2, v3, v1, v0}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v2, Lo2/b;->a:Lx2/a;

    new-instance v0, Lo3/d;

    invoke-direct {v0}, Lo3/d;-><init>()V

    sput-object v0, Lo2/b;->b:Ls2/a;

    return-void
.end method
