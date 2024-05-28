.class public final Lo2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/a$a;
    }
.end annotation


# static fields
.field public static final a:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Lo2/c;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Lo2/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Ls2/a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final e:Lp2/d;

.field public static final f:Lt2/a;

.field public static final g:Lx2/a$g;

.field public static final h:Lx2/a$g;

.field private static final i:Lx2/a$a;

.field private static final j:Lx2/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lx2/a$g;

    invoke-direct {v0}, Lx2/a$g;-><init>()V

    sput-object v0, Lo2/a;->g:Lx2/a$g;

    new-instance v1, Lx2/a$g;

    .line 2
    invoke-direct {v1}, Lx2/a$g;-><init>()V

    sput-object v1, Lo2/a;->h:Lx2/a$g;

    .line 3
    new-instance v2, Lo2/d;

    invoke-direct {v2}, Lo2/d;-><init>()V

    sput-object v2, Lo2/a;->i:Lx2/a$a;

    new-instance v3, Lo2/e;

    .line 4
    invoke-direct {v3}, Lo2/e;-><init>()V

    sput-object v3, Lo2/a;->j:Lx2/a$a;

    .line 5
    sget-object v4, Lo2/b;->a:Lx2/a;

    sput-object v4, Lo2/a;->a:Lx2/a;

    .line 6
    new-instance v4, Lx2/a;

    const-string v5, "Auth.CREDENTIALS_API"

    invoke-direct {v4, v5, v2, v0}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v4, Lo2/a;->b:Lx2/a;

    new-instance v0, Lx2/a;

    const-string v2, "Auth.GOOGLE_SIGN_IN_API"

    .line 7
    invoke-direct {v0, v2, v3, v1}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v0, Lo2/a;->c:Lx2/a;

    sget-object v0, Lo2/b;->b:Ls2/a;

    sput-object v0, Lo2/a;->d:Ls2/a;

    new-instance v0, Lp3/l0;

    invoke-direct {v0}, Lp3/l0;-><init>()V

    sput-object v0, Lo2/a;->e:Lp2/d;

    new-instance v0, Lu2/f;

    invoke-direct {v0}, Lu2/f;-><init>()V

    sput-object v0, Lo2/a;->f:Lt2/a;

    return-void
.end method
