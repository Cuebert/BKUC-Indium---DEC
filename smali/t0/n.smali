.class public final Lt0/n;
.super Lt0/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/n$a;
    }
.end annotation


# static fields
.field public static final p:Lt0/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt0/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt0/n$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lt0/n;->p:Lt0/n$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "android.credentials.GetCredentialException.TYPE_INTERRUPTED"

    invoke-direct {p0, v0, p1}, Lt0/m;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method
