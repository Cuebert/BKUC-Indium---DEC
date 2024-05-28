.class public final Ld4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx2/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$g<",
            "Lcom/google/android/gms/signin/internal/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lx2/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$g<",
            "Lcom/google/android/gms/signin/internal/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lx2/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$a<",
            "Lcom/google/android/gms/signin/internal/a;",
            "Ld4/a;",
            ">;"
        }
    .end annotation
.end field

.field static final d:Lx2/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$a<",
            "Lcom/google/android/gms/signin/internal/a;",
            "Ld4/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Ld4/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Ld4/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lx2/a$g;

    invoke-direct {v0}, Lx2/a$g;-><init>()V

    sput-object v0, Ld4/e;->a:Lx2/a$g;

    new-instance v1, Lx2/a$g;

    invoke-direct {v1}, Lx2/a$g;-><init>()V

    sput-object v1, Ld4/e;->b:Lx2/a$g;

    new-instance v2, Ld4/b;

    invoke-direct {v2}, Ld4/b;-><init>()V

    sput-object v2, Ld4/e;->c:Lx2/a$a;

    new-instance v3, Ld4/c;

    invoke-direct {v3}, Ld4/c;-><init>()V

    sput-object v3, Ld4/e;->d:Lx2/a$a;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "profile"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Ld4/e;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "email"

    .line 2
    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Ld4/e;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lx2/a;

    const-string v5, "SignIn.API"

    .line 3
    invoke-direct {v4, v5, v2, v0}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v4, Ld4/e;->g:Lx2/a;

    new-instance v0, Lx2/a;

    const-string v2, "SignIn.INTERNAL_API"

    .line 4
    invoke-direct {v0, v2, v3, v1}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v0, Ld4/e;->h:Lx2/a;

    return-void
.end method
