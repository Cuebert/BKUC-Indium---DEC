.class public final Lt0/c;
.super Lt0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/c$a;
    }
.end annotation


# static fields
.field public static final p:Lt0/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt0/c$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lt0/c;->p:Lt0/c$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "android.credentials.CreateCredentialException.TYPE_USER_CANCELED"

    invoke-direct {p0, v0, p1}, Lt0/e;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method
